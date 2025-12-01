let students = {};
let student = {};

const findAllStudents = async () => {
  let body = document.getElementById("section");
  let content = "";

  await fetch(`${API_URL}/user`, {
    method: "GET",
    headers: HEADERS,
  })
    .then((response) => response.json())
    .then((result) => {
      const { data, error } = result;

      if (data && data.length !== 0) {
        content = generateTable(data);
      } else {
        content = `
                <div class="alert alert-secondary rounded-4">
                    <span>Yo los habia ponido aquí</span>
                </div>`;
      }

      body.innerHTML = content;
    })
    .catch((error) => console.log("error", error));
};

const generateTable = (data) => {
  let row = "";

  data.forEach((item, index) => {
    row += `
            <tr>
                <td>${index + 1}</td>
                <td>${item.student.fullname}</td>
                <td>${item.student.matricula}</td>
                <td>${item.email}</td>
                <td>
                        <button onclick="askToUser(${
                          item.id
                        })" class="btn btn-danger"><i class="bi bi-trash"></i>Eliminar</button>
                        <button onclick="loadForm(${
                          item.id
                        })" class="btn btn-primary"><i class="bi bi-pencil"></i>Editar</button>
                </td>
            </tr>`;
  });

  let content = `
        <div class="table-responsive">
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Nombre completo</th>
                        <th scope="col">Matricula</th>
                        <th scope="col">Correo</th>
                        <th scope="col">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    ${row}
                </tbody>
            </table>
        </div>
    `;

  return content;
};

(async () => {
  await findAllStudents();
})();

const findById = async (id) =>
  student = await fetch(`${API_URL}/user/${id}`, {
    method: "GET",
    headers: HEADERS,
  })
    .then((response) => response.json())
    .then(({ data }) => {
      return data;
    })
    .catch(console.log);

const askToUser = async id => {
    await findById(id);
}

const loadForm = async id => {
    document.getElementById('saveBtn').classList.add('visually-hidden');
    document.getElementById('updateBtn').classList.remove('visually-hidden');
    document.getElementById('cancelUpdateBtn').classList.remove('visually-hidden');
    await findById(id);
    document.getElementById('fullname').value = student.student.fullname;
    document.getElementById('username').value = student.username;
    document.getElementById('email').value = student.email;


}
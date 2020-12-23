let student_form = document.getElementById('student-validation');
//window.onload = fetch_courses;

student_form.addEventListener('submit', async (e) => {
  e.preventDefault();
  e.stopPropagation();
  if (student_form.checkValidity() === true) {
    let response = await fetch('api/students/login', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json;charset=utf-8'
      },
      body: JSON.stringify({
          id : document.getElementById('id').value,

      })
    });
      let result = await response;
      if(response["status"] === 200){
        location.href = "fun.html";
      }else{
        document.getElementById("login-alert").style.display = "block";
      }
  }
}
)

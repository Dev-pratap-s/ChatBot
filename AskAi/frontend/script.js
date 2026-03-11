async function askAI(){

let question = document.getElementById("question").value
let response = document.getElementById("response")

if(question === ""){
response.innerText = "Please enter a question."
return
}

response.innerText = "Thinking..."

try{

let res = await fetch("http://localhost:8080/ask",{
method: "POST",
headers:{
"Content-Type":"application/json"
},
body: JSON.stringify({
question: question
})
})

let data = await res.text()

response.innerText = data

}catch(error){

response.innerText = "Error connecting backend"

}

}
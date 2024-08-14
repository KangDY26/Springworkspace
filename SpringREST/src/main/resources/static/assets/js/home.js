const btn = document.getElementById("btn");
const out = document.getElementById("out");

const btn2 = document.getElementById("btn2");
const btn3 = document.getElementById("btn3");


btn.addEventListener("click", (e) => {
	
	// 화면이 변하지 않는 요청을 보낼때 사용
	const xhttp = new XMLHttpRequest();
	
	// xhttp.open("method", "address")
	xhttp.addEventListener("readystatechange", (e) => {
		if (xhttp.readyState == 1) {
			console.log('open()이 성공했습니다!');
		} else if (xhttp.readyState == 2) {
			console.log('xhttp 요청을 보내고 응답을 받았습니다!');
		} else if (xhttp.readyState == 3) {
			console.log('응답을 받은 후 처리를 시작했습니다');
		} else if (xhttp.readyState == 4) {
			console.log('받은 응답에 대한 처리가 모두 끝났습니다. 사용하실 수 있습니다.');
			
			// 응답의 상태 코드에 따른 로직 구성이 가능하다
			if (xhttp.status = 200) {
				console.dir(xhttp);
				out.innerText = xhttp.responseText;
				
				
			}
			
		}
		
	}); // 서버로부터 ajax 요청에 대한 응답을 받을때마다 발생하는 이벤트를 설정
	
	xhttp.open("GET", "/rest/v1"); // 요청 보낼 메서드 및 주소 설정
	
	xhttp.send(); // 설정한 내용으로 요청을 보낸다

});

btn2.addEventListener("click", (e) => {
	const xhttp = new XMLHttpRequest();
	
	// load 이벤트로 처리하는 것도 가능 
	// (readyState 4에 해당하는 처리만 가능)
	xhttp.addEventListener("load", (e) => {
		console.log("xhttp에 대한 응답이 도착했습니다");	
		console.log(xhttp.responseText);
	});
	// form은 GET/POST밖에 못쓰지만
	// xhttp는 모든 메서드를 사용한 요청을 보낼 수 있다
	xhttp.open("PATCH", "/entity/test3");
	xhttp.setRequestHeader("content-type", "application/x-www-form-urlencoded");
	xhttp.send("fid=3&fname=포도&price=333");
});

btn3.addEventListener("click", (e) => {
	
	const xhttp = new XMLHttpRequest();
	
	xhttp.addEventListener("load", (e) => {
		
		if (xhttp.status == 200) {
			console.log("업데이트 성공: " + xhttp.responseText);
		} else if (xhttp.status == 502) {
			console.log("업데이트 실패: " + xhttp.responseText);
		}
		
	});

	
	xhttp.open("PUT", "/entity/test4");
	xhttp.setRequestHeader("content-type", "application/json");
	
	// JSON 형식 문자열을 실어보내면
	// 서버측의 jackson-databind가 받은 JSON을 데이터를 DTO로 바인딩해준다
	
	//xhttp.send("{\"fid\": 3, \"fname\": \"감귤\"}")
	
	// Javascript에서는 Javascript Object를 쉽게 JSON 문자열로 변환 할 수 있다
	const newFruit = {
		fid: 3,
		fname: "딸기",
		price: 3500
	};
	
	const jsonFruit = JSON.stringify(newFruit) 
	
	console.log("JSON으로 변환된 newFruit:", jsonFruit);
	xhttp.send(jsonFruit);
	
})








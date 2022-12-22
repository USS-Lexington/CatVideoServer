function loadXMLDoc() {
	let VueObj = this;
	let XMLHttp;
	if (window.XMLHttpRequest) {
		//  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		XMLHttp = new XMLHttpRequest();
	}
	XMLHttp.onreadystatechange = function () {
		if (XMLHttp.readyState === 4 && XMLHttp.status === 200) {
			// document.getElementsByClassName("el-main").innerHTML=XMLHttp.responseText;
			VueObj.text = XMLHttp.responseText;
		}
	}
	XMLHttp.open("GET", "./info.txt", true);
	XMLHttp.send();
	console.log("SUCCESS");
}
class Ajax{
	constructor(){
		this.xhr = new XMLHttpRequest();
	}
	
	get(url, params, callback){
		let s = '';
		let sep = '?'
		for(let p in params){
			s += sep + p + '=' + params[p];
			sep = '&';
		}
		
		this.xhr.onreadystatechange = () => {
			if(this.xhr.readyState == 4){
				if(this.xhr.status == 200){
					callback({
						text : this.xhr.responseText,
						xml : this.xhr.responseXML
					})
				}
			}
			
		}
		this.xhr.open('GET', url + s, true);
		this.xhr.send();
	}
	
	post(url, params, callback){
		let s = '';
		let sep = '?'
		for(let p in params){
			s += sep + p + '=' + params[p];
			sep = '&';
		}
		this.xhr.onreadystatechange = () =>{
			if(this.xhr.readyState == 4){
				if(this.xhr.status == 200){
					callback({
						text : this.xhr.responseText,
						xml : this.xhr.responseXML
					})
				}
			}
		}
		this.xhr.open('POST', url, true);
		this.xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded; charset=UTF-8');
		this.xhr.send(s);
	}
}
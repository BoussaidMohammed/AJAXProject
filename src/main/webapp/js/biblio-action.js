class BiblioAction{
	constructor(){
		this.ajax = new Ajax();
		this.elements();
	}
	
	elements(){
		this.name = document.getElementById('name');
		this.result = document.getElementById('result');
		this.id = document.getElementById('id');
		this.yearBorn = document.getElementById('yearBorn');
	}
	
	searchAuthorByName(){
		let url = "biblio/search-author";
		let params = {
			name : this.name.value
		}
		
		this.ajax.get(url,params, (res) =>{
			let authors = JSON.parse(res.text);
			console.log(authors);
			let s = '<ol>';
			for(let a of authors){
				console.log(a.name);
				s += '<li>' + a.name + '</li>'
			}
			s += '</ol>';
			this.result.innerHTML = s;
		})
		
	}
	
	postAuthor(){
		let params = {
			id : this.id.value,
			name : this.name.value,
			yearBorn: this.yearBorn.value
		}
		console.log(params);
		
		let url = "biblio/add-author";
		
		this.ajax.post(url, params, (resp) =>{
			this.result.innerHTML = "done" + resp.message;
		})
	}
}

let uri = window.location.search.substring(1); 
let params = new URLSearchParams(uri);
    
if(params.has('code')){
  axios
    .get('/code/'+params.get("code"))
    .then(r1 => {
      var code = r1.data;
      axios
        .get('/ingress/app/'+code.appCode)
        .then(r2 => {
          var ingress = r2.data;
          ingress.nbAccess += 1;
          axios
            .post('/ingress/add', ingress)
            .then(r3 => {
              window.location.href=ingress.serviceURL+params.get("code");
            });
        });
      
    });
}  



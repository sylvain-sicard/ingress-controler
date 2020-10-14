
let uri = window.location.search.substring(1); 
let params = new URLSearchParams(uri);
    
if(params.has('code') && params.has('type')){
  axios
    .get('/ingress/search/'+params.get("type")+'/'+params.get("code"))
    .then(response => {
      var ingress = response.data;
      window.location.href=ingress.serviceURL+params.get("code");
    });
}  



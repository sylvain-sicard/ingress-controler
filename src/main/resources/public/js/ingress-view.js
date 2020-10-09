Vue.use(vueMoment);

const app = new Vue({

  el: '#wrapper',
  components: {
  },
  data : {
        ingress: {}
  },
  mounted () {
  	let uri = window.location.search.substring(1); 
    let params = new URLSearchParams(uri);
    
    if(params.has('id')){
      axios
        .get('/ingress/'+params.get("id"))
        .then(response => {
          this.ingress = response.data;
        });
    }
  }
});



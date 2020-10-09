Vue.use(vueMoment);

const app = new Vue({

  el: '#wrapper',
  components: {
  	vuejsDatepicker
  },
  data : {
        ingress: {
          nbAccess : 0
        }
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
  },
  methods: {
    save: function () {
      axios
        .post('/ingress/add', this.ingress)
        .then(response => {
          this.ingress = response.data;
          window.location.href='/ingress-view.html?id='+this.ingress.id;
        });
    },
    remove: function () {
      axios
        .delete('/ingress/'+this.ingress.id)
        .then(response => {
          this.ingress = {};
          window.location.href='/ingress-list.html';
        });
    }
  }
});



Vue.use(vueMoment);

const app = new Vue({
  el: '#wrapper',
  data : { 
        ingresses: null
  },
  mounted () {
    
    axios
      .get('/ingress/all')
      .then(response => {
        this.ingresses = response.data;
          $(document).ready(function() {
          $('#dataTable').DataTable();
        });
      });
    
  }
});

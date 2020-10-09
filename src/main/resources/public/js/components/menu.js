Vue.component('menu-component',{
  data () {
    return {
      items : [
        {label:"Ingress", img:"img/ingress.png", url:"ingress-list.html"}

      ]
    }
  },
  template:`
  <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="menu-component">
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html"> 
      <div class="sidebar-brand-icon "> 
        <img src="img/ingresscontroler.png" width="50"> 
      </div> 
      <div class="sidebar-brand-text mx-3">Ingress Controler</div> 
    </a> 
    <hr class="sidebar-divider my-0"/> 
    <div v-for="item in items">
      <li class="nav-item" :class="isActive(item.url)"> 
        <a class="nav-link" :href="item.url"> 
          <i class="fas fa-fw"> <img :src="item.img" width="25"> </i> 
          <span>{{item.label}}</span> 
        </a> 
      </li> 
      <hr class="sidebar-divider"/> 
    </div> 
  </ul>`,
  methods:{
    isActive: function(url){
      var curUrl = window.location.pathname;

      console.log(url + " : " + curUrl);
      return curUrl == "/"+url ? "active" : ""; 
    }
  }
})

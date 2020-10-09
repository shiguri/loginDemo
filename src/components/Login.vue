<template>
    <div id="login-form">
        <input type="text" v-model="User.name" id="name" placeholder="请输入用户名">
        <input type="text" v-model="User.password" id="password" placeholder="请输入正确的密码">
        <button type="submit" v-on:click="login">登录</button>
    </div>
</template>

<script>
export default {
    name: 'Login',
    data: function(){
        return {
            User: {
                name: '',
                password: '',
            },
            
        }
    },

    methods:{
        login: function(){
            this.$axios.post('/login',{
                name: this.User.name,
                password: this.User.password,
            }).then(res => {
                console.log(res);
                if(res.data.code === 200){
                    window.alert("Welcome!");
                    this.$router.replace({path: '/index'});
                }else{
                    window.alert("账号或密码有误");
                }
            }).catch(failResponse => {
                console.log(failResponse);
            })
        }
    }
}
</script>
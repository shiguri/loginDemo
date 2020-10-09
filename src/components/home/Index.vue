<template>
    <nav id="nav">
        <h2>“我喜欢上了你 于是我买了日记————”</h2>
        <h2>“为了维系与花儿共飞散的光阴”</h2>
        <div class="character" v-for="(item, index) in characters" v-bind:key="index">
            {{item.name}}
        </div>
    </nav>
</template>

<script>
export default {
    name: 'Index',
    data: function(){
        return{
          characters : [
              {
                  name: '南乃爱丽丝',
                  id: 0,
                  description: '恋上樱花，向阳般的少女',
              },
              {
                  name: '时计坂零',
                  id: 1,
                  description: '姐姐是理事长，击碎幻想的热情之枪',
              },
              {
                  name: '时计坂花音',
                  id: 2,
                  description: '妹妹是女仆，击碎幻想的冷静之枪',
              },
              {
                  name: '柏原美衣',
                  id: 3,
                  description: '相机对面映出的是……虚幻般的Prima Donna',
              },
              {
                  name: '周防圣',
                  id: 4,
                  description: '降临于这个腐败的世界的圣子。对臭过敏的毒舌修女',
              },
              {
                  name: '藤田昆仑',
                  id: 5,
                  description: '神秘之王。她掌握着恋爱的神秘？',
              }
          ]
        }
    }
}
</script>

<style>
    nav {
        width: 100%;
        background-color: ghostwhite;
        border-top: 2px solid #ff99cc;
    }

    h2 {
        color: #ff66b5;
        clear: both;
    }

    div.character{
        display: inline;
        font-size: large;
        padding-left: 6%;
        padding-right: 6%;
        border: 0;
        margin: 0;
        color: skyblue;
    }
</style>
<template>
  <div id="app">
    <HomePage />
  </div>
</template>

<script>
import HomePage from './components/Home.vue'

export default {
  name: 'App',
  components: {
    HomePage
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: center;
  background-color: #13c4af;
  /* 設置背景顏色為黃色 */
  min-height: 100vh;
  /* 確保背景顏色覆蓋整個視窗高度 */
  padding: 0;
  /* 移除預設內邊距 */
  margin: 0;
  /* 移除預設邊距 */
}
</style>
<template>
    <div class="container">
        <h1>員工座位安排系統</h1>
        <button @click="showSeatingChart = !showSeatingChart">
            {{ showSeatingChart ? '隱藏座位表' : '顯示座位表' }}
        </button>
        <SeatingChartPage v-if="showSeatingChart" />
    </div>
</template>

<script>
import SeatingChartPage from './SeatingChart.vue';
export default {
    name: 'HomePage',
    components: {
        SeatingChartPage
    },
    data() {
        return {
            showSeatingChart: false
        };
    }
};
</script>

<style scoped>

h1 {
    color: white;
    /* 白色字體 */
    margin-bottom: 20px;
    /* 標題下方間距 */
}

a {
    color: #000000;
    /* 連結文字顏色 */
    text-decoration: none;
    /* 移除底線 */
    margin: 0 10px;
}
button {
    color: #000000;
    background: white;
    border: none;
    padding: 10px;
    cursor: pointer;
}
button:hover {
    text-decoration: underline;
}

a:hover {
    text-decoration: underline;
    /* 滑鼠懸停顯示底線 */
}
</style>
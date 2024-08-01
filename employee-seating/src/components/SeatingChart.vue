<template>
    <div>
        <h1>Seating Chart</h1>
        <div v-if="error" class="error">Error: {{ error }}</div>
        <table v-if="!loading && !error"></table>
            <thead>
                <tr>
                    <th>Floor No</th>
                    <th>Seat No</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="seat in seatingCharts" :key="seat.floorSeatSeq">
                    <td>{{ seat.floorNo }}</td>
                    <td>{{ seat.seatNo }}</td>
                </tr>
            </tbody>
    </div>
</template>

<script>
import axios from 'axios';
export default {
    name: 'SeatingChartPage',
    data() {
        return {
            seatingCharts: [], // 用來存儲座位表數據
            loading: true, // 載入狀態
            error: null // 錯誤信息
        };
    },
    created() {
        this.fetchSeatingCharts();
    },
    methods: {
        async fetchSeatingCharts() {
            try {
                const response = await axios.get('http://localhost:8080/seating-charts');
                this.seatingCharts = response.data;
            } catch (err) {
                this.error = err.message;
            } finally {
                this.loading = false;
            }
        }
    }
};
</script>

<style scoped>
.container {
    padding: 20px;
}

table {
    width: 100%;
    border-collapse: collapse;
}

th,
td {
    padding: 10px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

th {
    background-color: #f4f4f4;
}

.error {
    color: red;
}
</style>


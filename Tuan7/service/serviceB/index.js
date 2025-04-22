const express = require('express');
const app = express();
const PORT = 3001;

// Mô phỏng lỗi ngẫu nhiên
app.get('/api/data', (req, res) => {
    if (Math.random() < 0.2) { // 70% lỗi
        return res.status(500).send('Lỗi từ Service B');
    }
    res.json({ data: '✅ Dữ liệu từ Service B' });

    setTimeout(() => {
        res.json({ data: '✅ Dữ liệu từ Service B (chậm)' });
    }, 3000);

});

// app.get('/api/data', (req, res) => {
//     res.status(500).json({ error: 'ServiceB bị lỗi' });
// });


app.listen(PORT, () => console.log(`✅ Service B đang chạy tại http://localhost:${PORT}`));
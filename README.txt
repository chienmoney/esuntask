先執行後端etask，端口會自動8080，mvn clean install後，用java -jar .\target\etask-0.0.1-SNAPSHOT.jar執行。
再執行前端employee-seating，端口因8080占用會自動改8081，用npm run serve執行。
瀏覽器打開http://localhost:8081/

目前進度：後端大致完成，後端API完成，前端雛型完成，但嘗試從API取得資料失敗，修改中。

etask\target\etask-0.0.1-SNAPSHOT.jar檔案太大無法上傳，執行前要先編譯，才會出現這個檔案。
employee-seating\node_modules 資料夾內容太大沒有上傳，可以用package.json重新生成，在目錄內執行npm install。

WITH DailySums AS (
    SELECT visited_on, SUM(amount) AS day_amount
    FROM Customer
    GROUP BY visited_on
)
SELECT 
    visited_on,
    amount,
    average_amount
FROM (
    SELECT 
        visited_on,
       
        SUM(day_amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING) AS amount,
     
        ROUND(AVG(day_amount) OVER (ORDER BY visited_on ROWS 6 PRECEDING), 2) AS average_amount,
        
        ROW_NUMBER() OVER (ORDER BY visited_on) AS rn
    FROM DailySums
) temp
WHERE rn >= 7;
select Email from Person group by email having count(*)>1;

CREATE TABLE transaction
(
  id INT,
  account_no INT ,
  date DATE NOT NULL,
  transaction_detail VARCHAR(255),
  value_date DATE NOT NULL,
  withdrawal_amount INT,
  deposit_amount INT,
  balance_amount INT
--    PRIMARY KEY(id)
);
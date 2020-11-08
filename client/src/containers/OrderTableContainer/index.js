import React, { useState, useEffect, useRef } from 'react';
import Table from '../../components/Table';
import { getOrders } from '../../common/api/order-api';

const OrderTableContainer = () => {
  const [orders, setOrders] = useState([]);
  const ws = useRef(null);
  useEffect(() => {
    ws.current = new WebSocket(process.env.REACT_APP_WS_URL);
    const fetchData = async () => {
      setOrders(await getOrders());
    }
    fetchData();
  }, []);

  useEffect(() => {
    ws.current.onmessage = (event) => {
      setOrders([...orders,JSON.parse(event.data)]);
    };
  }, [orders]);

  return (
    <Table orderDataSet={orders} />
  )
};

export default OrderTableContainer;
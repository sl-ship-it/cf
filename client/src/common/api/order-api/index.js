import apiClient from '../api-client';

const getOrders = async () => {
  return (await apiClient.get('/order')).data;
};


export {
  getOrders
};
import React from 'react';
import OrderTableContainer from '../../containers/OrderTableContainer'
import Title from '../../components/Title';

const OrderListingPage = () => {
  return (
    <React.Fragment>
      <Title>Order Page</Title>
      <OrderTableContainer />
    </React.Fragment>
  )
}

export default OrderListingPage;
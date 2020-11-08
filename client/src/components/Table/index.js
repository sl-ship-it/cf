import React from 'react';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import styled from 'styled-components';
import PropTypes from 'prop-types';


const StyledTableCell = styled(TableCell)`
  background-color: black  
  color: white
`;


const OrderTable = (props) => {
  const tableRows = props.orderDataSet;
  return (
    <TableContainer>
      <Table aria-label="customized table">
        <TableHead>
          <TableRow>
            <StyledTableCell>Order ID</StyledTableCell>
            <StyledTableCell align="left">User ID</StyledTableCell>
            <StyledTableCell align="left">Sell Currency</StyledTableCell>
            <StyledTableCell align="left">Buy Currency</StyledTableCell>
            <StyledTableCell align="left">Sell Amount</StyledTableCell>
            <StyledTableCell align="left">Buy Amount</StyledTableCell>
            <StyledTableCell align="left">Sell Currency/Buy Currency Rate</StyledTableCell>
            <StyledTableCell align="left">Time</StyledTableCell>
            <StyledTableCell align="left">Orig. Country</StyledTableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {
            tableRows.map((tableRow) => <TableRow key={tableRow.orderId}>
              <StyledTableCell>{tableRow.orderId}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.userId}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.currencyFrom}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.currencyTo}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.amountSell}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.amountBuy}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.rate}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.timePlaced}</StyledTableCell>
              <StyledTableCell align="left">{tableRow.originatingCountry}</StyledTableCell>
            </TableRow>)
          }
        </TableBody>
      </Table>
    </TableContainer>
  );
}

OrderTable.propTypes = {
   orderDataSet: PropTypes.array
}

export default OrderTable;

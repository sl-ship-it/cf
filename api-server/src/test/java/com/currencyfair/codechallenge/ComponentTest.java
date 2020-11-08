package com.currencyfair.codechallenge;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.OffsetDateTime;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.currencyfair.codechallenge.repo.OrderRepository;
import com.currencyfair.codechallenge.repo.entity.OrderEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class ComponentTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private OrderRepository orderRepository;

	@Test
	public void shouldCreateAnOrder() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/order")
				.header("Content-Type", "application/json")
				.content(
				"{\"userId\":\"134256\",\"currencyFrom\":\"EUR\",\"currencyTo\":\"GBP\",\"amountSell\":10000,\"amountBuy\":747.1,\"rate\":0.747,\"timePlaced\":\"24-Jan-18 10:27:44\",\"originatingCountry\":\"FR\"}"))
				.andDo(print())
				.andExpect(status().isCreated());
		Assert.assertEquals(orderRepository.count(), 1);
	}
	
	@Test
	public void shouldReturnOrder() throws Exception {
		OrderEntity entity = new OrderEntity();
		entity.setUserId("12345");
		entity.setTimePlaced(OffsetDateTime.now());
		orderRepository.save(entity);
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/order")
				.header("Accept", "application/json"))
				.andDo(print())
				.andExpect(status().isOk()).andReturn();
		String content = result.getResponse().getContentAsString();
		Assert.assertEquals(content.contains("orderId"), true);
		
	}

}

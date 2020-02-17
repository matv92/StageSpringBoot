//package it.portit.napier.rest;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import it.portit.napier.payload.request.LoginRequest;
//import it.portit.napier.payload.request.ScreenCustomerRequest;
//import it.portit.napier.payload.request.ScreenEntityRequest;
//import it.portit.napier.payload.request.ScreenPersonRequest;
//import it.portit.napier.payload.request.TransScoreRequest;
//import it.portit.napier.payload.response.LoginResponse;
//import it.portit.napier.payload.response.ScreenCustomerResponse;
//import it.portit.napier.payload.response.ScreenEntityResponse;
//import it.portit.napier.payload.response.ScreenPersonResponse;
//import it.portit.napier.payload.response.TransScoreResponse;
//
//@FeignClient(name = "NapierService", url = "https://demo.napier.ai/api")
//public interface NapierClient {
//	
//	@RequestMapping(			
//			method= RequestMethod.POST,
//			value="/token",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public LoginResponse login(@RequestBody LoginRequest req);	
//	
//	@RequestMapping(
//			method= RequestMethod.POST,
//			value="/transactions/score",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public TransScoreResponse getTransactionScore(
//			@RequestHeader("Authorization") String authHeader,
//			@RequestParam(name = "scoreSetId") String scoreSetId,
//			@RequestParam(name = "dataSource", required = false, defaultValue = "calibration") String dataSource,
//			@RequestBody TransScoreRequest req);
//	
//	@RequestMapping(			
//			method= RequestMethod.POST,
//			value="/screen/person",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public ScreenPersonResponse getScreenPerson(
//			@RequestHeader("Authorization") String authHeader,
//			@RequestBody ScreenPersonRequest req);
//
//	@RequestMapping(			
//			method= RequestMethod.POST,
//			value="/screen/entity",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public ScreenEntityResponse getScreenEntity(
//			@RequestHeader("Authorization") String authHeader,
//			@RequestBody ScreenEntityRequest req );
//
//	@RequestMapping(			
//			method= RequestMethod.POST,
//			value="/screen/customer",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public ScreenCustomerResponse getScreenCustomer(
//			@RequestHeader("Authorization") String authHeader,
//			@RequestBody ScreenCustomerRequest req);
//
//
//}
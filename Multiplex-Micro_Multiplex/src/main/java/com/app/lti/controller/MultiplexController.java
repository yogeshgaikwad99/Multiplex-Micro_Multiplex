package com.app.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lti.document.MultiplexDocument;
import com.app.lti.service.MultiplexService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/multiplex")
public class MultiplexController {
	
	@Autowired
	private MultiplexService service; 
	
	@PostMapping("/register")
	public ResponseEntity<MultiplexDocument> register(@RequestBody MultiplexDocument multiplexDocument) {
		MultiplexDocument multDocument = this.service.registerMultiplex(multiplexDocument);
		ResponseEntity<MultiplexDocument> response = 
				new ResponseEntity<MultiplexDocument>(multiplexDocument,HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/findById/{multiplexId}")
	public ResponseEntity<MultiplexDocument> getUserDetail(@PathVariable(value = "multiplexId") String multiplexId ) {
		
		if (multiplexId != null) {
				
			new ResponseEntity<MultiplexDocument>(HttpStatus.FOUND);
			return ResponseEntity.of(service.getMultiplexDetail(multiplexId));
			
		}
		return new ResponseEntity<MultiplexDocument>(HttpStatus.NOT_FOUND);
	}
		
	@GetMapping("/findAllMultiplex")
	public ResponseEntity<List<MultiplexDocument>> findAllUser(MultiplexDocument multiplexDocument) {
		new ResponseEntity<MultiplexDocument>(HttpStatus.FOUND);
		return ResponseEntity.ok(service.findAll());
	}

	@DeleteMapping("/deleteById/{movieId}")
	public void deleteById(@PathVariable(value = "movieId") String movieId) {
		service.deleteMujltiplexById(movieId);

	}

	@DeleteMapping("/deleteAll")
	public void deleteAll(MultiplexDocument multiplexDocument) {
		service.deleteAll();

	}
	@PutMapping(value="updateMultiplex/{multiplexId}")
	public MultiplexDocument updateMultiplex(@PathVariable("multiplexId") String multiplexId, @RequestBody MultiplexDocument multiplexDocument)
	{
		return service.updateMultiplexDetail(multiplexId, multiplexDocument);
	}

}

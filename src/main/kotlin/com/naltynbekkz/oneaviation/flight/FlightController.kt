package com.naltynbekkz.oneaviation.flight

import com.naltynbekkz.oneaviation.util.SessionManager
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/flights")
class FlightController(
    private val flightRepository: FlightRepository,
    private val sessionManager: SessionManager, 
){
 
    
    
    
}

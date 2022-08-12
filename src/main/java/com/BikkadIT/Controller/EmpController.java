package com.BikkadIT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.Service.ServiceI;
@Controller
public class EmpController {
	@Autowired
private ServiceI serviceI;
}

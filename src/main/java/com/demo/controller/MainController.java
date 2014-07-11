package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping
public class MainController {

	@RequestMapping("demo/getDate")
	public @ResponseBody
	String createUserNode(@RequestParam Integer userId) throws Exception {
		List<Map> list = new ArrayList<Map>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "小马哥");
		map.put("interest", "Fight the Landlord");
		list.add(map);

		return JSON.toJSONString(list);
	}
}
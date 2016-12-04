package org.sagesource.zookeeperdriver.web.controller.page;

import org.sagesource.zookeeperdriver.web.controller.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>首页Controller</p>
 * <pre>
 *     author      Sage XueQi
 *     date        2016/12/3
 *     email       job.xueqi@gmail.com
 * </pre>
 */
@Controller
public class IndexPageController extends BaseController {
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexPageController.class);

	/**
	 * 首页
	 *
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index/index";
	}

}
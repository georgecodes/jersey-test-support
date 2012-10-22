package com.elevenware.jersey.common.testing;

import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.TestContainerException;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;

/**

 * @author George McIntosh
 *
 */

/**
 * Test class which will wire itelf into your the Spring context which
 * is configured on the WebAppDecriptor built for your tests.
 * Ensure you configure annotation-aware support into your contexts,
 * and annotate any auto-wire properties on your test class
 *
 * @author Copyright (c) 2012 George McIntosh <george@elevenware.com>
 *
 * This code was released by its author under the Apache License,
 * Version 2.0 (the "License") on 21st October 2012;
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
public abstract class AbstractSpringAwareJerseyTest extends JerseyTest {

	public AbstractSpringAwareJerseyTest(WebAppDescriptor wad) {
		super(wad);
	}
	
	protected TestContainerFactory getTestContainerFactory() throws TestContainerException {
		return new SpringAwareGrizzlyTestContainerFactory(this);
	}
	
}
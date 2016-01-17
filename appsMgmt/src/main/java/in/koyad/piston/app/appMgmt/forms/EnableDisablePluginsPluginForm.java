/*
 * Copyright (c) 2012-2016 Shailendra Singh <shailendra_01@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package in.koyad.piston.app.appMgmt.forms;

import in.koyad.piston.controller.plugin.annotations.AnnoPluginForm;
import lombok.Data;

@AnnoPluginForm(name = EnableDisablePluginsPluginForm.FORM_NAME)
@Data
public class EnableDisablePluginsPluginForm {
	
	public static final String FORM_NAME = "enableDisablePlugins";

	private String[] pluginIds;
	private String action;

}

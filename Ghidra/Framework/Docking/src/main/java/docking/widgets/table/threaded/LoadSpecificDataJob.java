/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package docking.widgets.table.threaded;

import ghidra.util.task.TaskMonitor;

public class LoadSpecificDataJob<T> extends TableUpdateJob<T> {

	LoadSpecificDataJob(ThreadedTableModel<T, ?> model, TaskMonitor monitor, TableData<T> data) {
		super(model, monitor);
		setData(data);

		// set the comparator so the data will be sorted; always force a sort, since we just 
		// loaded the data
		requestSort(model.getSortingContext(), true);
	}
}

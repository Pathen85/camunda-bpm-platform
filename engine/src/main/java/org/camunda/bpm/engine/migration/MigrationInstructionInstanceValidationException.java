/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.camunda.bpm.engine.migration;

import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.migration.MigrationInstructionInstanceValidationReport;

/**
 * Thrown if at least one migration instruction cannot be applied to the activity intance it matches. Contains
 * a {@link MigrationInstructionInstanceValidationReport} object that contains the details for all validation errors.
 *
 * @author Thorben Lindhauer
 */
public class MigrationInstructionInstanceValidationException extends ProcessEngineException {

  private static final long serialVersionUID = 1L;

  protected MigrationInstructionInstanceValidationReport validationReport;

  public MigrationInstructionInstanceValidationException(String message, MigrationInstructionInstanceValidationReport validationReport) {
    super(message);
    this.validationReport = validationReport;
  }

  /**
   * A report with all instructions that cannot be applied to the given process instance
   */
  public MigrationInstructionInstanceValidationReport getValidationReport() {
    return validationReport;
  }

}
/*
     fEMR - fast Electronic Medical Records
     Copyright (C) 2014  Team fEMR

     fEMR is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     fEMR is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with fEMR.  If not, see <http://www.gnu.org/licenses/>. If
     you have any questions, contact <info@teamfemr.org>.
*/
package femr.ui.models.pharmacy;

import femr.common.models.PrescriptionItem;

import java.util.List;

public class EditViewModelPost {
    private List<PrescriptionItem> prescriptions;

    private String disclaimer;
    private String notDispensed;

    public List<PrescriptionItem> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<PrescriptionItem> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getDispensedCheck() {
        return notDispensed;
    }

    public void setDispensedCheck(String notDispensed) {
        this.notDispensed = notDispensed;
    }
}

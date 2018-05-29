package net.martagir.DutyManagementSystem.controller;

import net.martagir.DutyManagementSystem.model.Soldier;
import net.martagir.DutyManagementSystem.service.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marat <martagir@yandex.ru> on 29.05.2018.
 */
@Controller
public class SoldierController {
    private SoldierService soldierService;

    @Autowired(required = true)
    @Qualifier(value = "soldierService")
    public void setSoldierService(SoldierService soldierService) {
        this.soldierService = soldierService;
    }

    @RequestMapping(value = "soldiers", method = RequestMethod.GET)
    public String listSoldiers(Model model) {
        model.addAttribute("soldier", new Soldier());
        model.addAttribute("listSoldiers", this.soldierService.listSoldiers());

        return "soldiers";
    }

    @RequestMapping(value = "/soldiers/add", method = RequestMethod.POST)
    public String addSoldier(@ModelAttribute("soldier") Soldier soldier) {
        if (soldier.getId() == 0) {
            this.soldierService.addSoldier(soldier);
        } else {
            this.soldierService.updateSoldier(soldier);
        }

        return "redirect:/soldiers";
    }

    @RequestMapping("/remove/{id}")
    public String removeSoldier(@PathVariable("id") int id) {
        this.soldierService.removeSoldier(id);

        return "redirect:/soldiers";
    }

    @RequestMapping("edit/{id}")
    public String editSoldier(@PathVariable("id") int id, Model model) {
        model.addAttribute("soldier", this.soldierService.getSoldierById(id));
        model.addAttribute("listSoldiers", this.soldierService.listSoldiers());

        return "soldiers";
    }

    @RequestMapping("soldierdata/{id}")
    public String soldierData(@PathVariable("id") int id, Model model) {
        model.addAttribute("soldier", this.soldierService.getSoldierById(id));

        return "soldierdata";
    }
}

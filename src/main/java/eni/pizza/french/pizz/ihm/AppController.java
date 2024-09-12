package eni.pizza.french.pizz.ihm;

import eni.pizza.french.pizz.bll.ProduitManager;
import eni.pizza.french.pizz.bo.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    ProduitManager produitManager;

    public AppController(ProduitManager produitManager) {
        this.produitManager = produitManager;
    }

    //test
    @GetMapping("home")
    public String homePage() {
        return "home";
    }

    @GetMapping("menu")
    public String menuPage(Model model) {
        List<Produit> produits = produitManager.getAllProduits();

        model.addAttribute("produits", produits);

//        if (!produits.isEmpty()) {
//            Produit lastProduit = produit.get(produit.size() - 1);
//            model.addAttribute("lastProduit", lastProduit);
//        }
        return "menu";
    }
}

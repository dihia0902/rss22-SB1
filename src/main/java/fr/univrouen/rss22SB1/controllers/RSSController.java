package fr.univrouen.rss22SB1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RSSController {
	


	
	
        @GetMapping("/resume")
        public String getListRSSinXML() {
            return "Envoi de la liste des flux RSS";
         
        }
        @GetMapping("/guid")
        public String getRSSinXML() {
            return "Détail du contenu RSS demandé";
        }
        }


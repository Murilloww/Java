package com.example.blockchain.controller;

import com.example.blockchain.services.Minerador;
import org.springframework.web.bind.annotation.*;
import com.example.blockchain.services.Blockchain;
import com.example.blockchain.services.Block;

import java.util.List;


@RestController
@RequestMapping("/node")
public class Node {

    private Blockchain blockchain;

    public Node(){
        blockchain = new Blockchain();

    }

    @GetMapping("/isvalid")
    public String isValid(){
        return blockchain.isChainValid() ? "Blockchain valida":"Blockchain invalida";

    }

    @GetMapping("/blockchain")
    public List<Block> getBlockchain(){
        return blockchain.getChain();
    }

    @PostMapping("/addblock")
    public String addBlock(@RequestBody String data){
        Block newBlock = new Block(blockchain.getLastBlock().getIndex()+1,
                System.currentTimeMillis(),data,blockchain.getLastBlock().getHash());
        Minerador minerador = new Minerador(4);
        minerador.mineBlock(newBlock);
        blockchain.addBlock(newBlock);
        return "Block Adicionado com Sucesso";
    }
}

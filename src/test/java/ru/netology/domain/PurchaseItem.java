package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseItem {
        private int id;
        private int movie;
        private String movieName;
        private int moviePrice;
        private int count;
    }


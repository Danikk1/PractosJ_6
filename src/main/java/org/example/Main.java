package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на завод карандашей!");

        PencilFactory pencilFactory = new PencilFactory(5000, 4000, "HB");

        pencilFactory.showProductionStatus();

        pencilFactory.scheduleMaintenance();

        pencilFactory.automateProduction();

        pencilFactory.analyzeData();

        pencilFactory.customizeProduct("Red");

        pencilFactory.prioritizeOrders(new ArrayList<>(List.of("order1", "order2")));

        PencilFactory.handleEmergency();

        PencilFactory.manageEmployees();
    }

    public static class PencilFactory {
        private static final Logger LOGGER = Logger.getLogger(PencilFactory.class.getName());
        private static FileHandler FILE_HANDLER = null;

        static {
            try {
                FILE_HANDLER = new FileHandler("pencil_factory.log", true);
                FILE_HANDLER.setFormatter(new SimpleFormatter());
                LOGGER.addHandler(FILE_HANDLER);
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Ошибка при создании файла лога pencil_factory.log", e);
            }
        }

        private final int productionCapacity;
        private final int demand;
        private final String leadGrade; // Градация графита

        public PencilFactory(int productionCapacity, int demand, String leadGrade) {
            this.productionCapacity = productionCapacity;
            this.demand = demand;
            this.leadGrade = leadGrade;

            if (FILE_HANDLER != null) {
                LOGGER.info("Создан экземпляр PencilFactory");
            }
        }

        public int calculateExcess() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Расчет излишков производства");
            }
            return productionCapacity - demand;
        }

        public void showProductionStatus() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Вывод текущего состояния производства карандашей");
            }
            System.out.println("Текущее состояние производства карандашей:");
            System.out.println("Производственная мощность: " + productionCapacity);
            System.out.println("Спрос: " + demand);
            System.out.println("Градация графита: " + leadGrade);
        }

        public void scheduleMaintenance() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Запланировано техническое обслуживание оборудования для производства карандашей");
            }
            System.out.println("Запланировано техническое обслуживание оборудования для производства карандашей.");
        }

        public void automateProduction() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Автоматизация производственных процессов карандашей");
            }
            System.out.println("Автоматизация производственных процессов карандашей.");
        }

        public void analyzeData() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Анализ данных для оптимизации производства карандашей");
            }
            System.out.println("Анализ данных для оптимизации производства карандашей.");
        }

        public void customizeProduct(String color) {
            if (FILE_HANDLER != null) {
                LOGGER.info("Персонализация продукции карандашей: " + color + " карандаши");
            }
            System.out.println("Персонализация продукции карандашей: " + color + " карандаши.");
        }

        public void prioritizeOrders(List<String> orders) {
            if (FILE_HANDLER != null) {
                LOGGER.info("Определение приоритета заказов на производство карандашей: " + orders);
            }
            System.out.println("Определение приоритета заказов на производство карандашей: " + orders);
        }

        public static void handleEmergency() {
            if (FILE_HANDLER != null) {
                LOGGER.warning("Обработка аварийных ситуаций на заводе карандашей");
            }
            System.out.println("Обработка аварийных ситуаций на заводе карандашей.");
        }

        public static void manageEmployees() {
            if (FILE_HANDLER != null) {
                LOGGER.info("Управление персоналом на заводе карандашей");
            }
            System.out.println("Управление персоналом на заводе карандашей.");
        }
    }
}

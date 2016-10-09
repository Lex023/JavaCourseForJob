package lesson4;

/**
 * Класс реализует кальтулятор
 */
public class Calculator {
/**
 * Результат вычисления
  */
    private int result;
    /**
     * Суммируем аргументы
     * @param params аргументы суммирования
     */
    public void add(int ... params){
        for(Integer param : params){
            this.result =+ param;
        }
    }
    /**
     * Получение результата
     * @return результат вычисления
     */
    public int getResult(){
        return this.result;
    }
    /**
     * Очистить результат вычисления
     */
    public void cleanResult(){
        this.result = 0;
    }
}

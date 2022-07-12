package ribeiraoPreto;

//Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
//O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h
//e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h.
//Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

//        IMPORTANTE:
//        a)     Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
//        b)     Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
//        c)     Explique como chegou no resultado.

public class Exercicio4 {


    /*
    * Franca ---------------- Ribirão
    *   0           ->          100
    *
    * Cheguei a conclusão que precisamos usar a formula do espaço
    *
    * s1 = s01 + v2 * d.t
    *                       Neste cado considerei o tempo o mesmo pelo fato
    *                       de sairem ao mesmo tempo cada um na sua respectiva cidade.
    *
    *                       Tambem temos informação que o o tempo deles seram iguais quando s1 = s2
    * s2 = s02 + v1 * d.t
    *
    * Sendo assim temos
    *   s01 + v1 * t = s02 + v2 * t
    *
    *   Calculando:
    *       0 + 80 / v1 * t = 100 -110/v2 * t2 = t 100/190 = 10/19 horas
    *
    *       s1 || s2 = 0 + 80 > 10/19 ~= 42 km
    *
    *       Jogando neste calculo se for > 50 estara mais proximo de ribeirao
    *       Sabendo tambem que o caminhao perdeu 10 minutos de pedagio o carro estaria mais proximo de ribeirao
    *
    *
    * */
}

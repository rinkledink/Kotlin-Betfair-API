package com.prince.betfair.betfair.betting.enums.market

/**
 * @property BACK: To back a team, horse or outcome is to bet on the selection to win. For LINE markets a Back bet
 * refers to a SELL line. A SELL line will win if the outcome is LESS THAN the taken line (price)
 * @property LAY: To lay a team, horse, or outcome is to bet on the selection to lose. For LINE markets a Lay bet refers
 * to a BUY line. A BUY line will win if the outcome is MORE THAN the taken line (price)
 */
enum class Side {
    BACK,
    LAY
}

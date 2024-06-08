
-- #df:begin#
CREATE FUNCTION fx_qtybystyle1(
    @an_Qty   DECIMAL,
    @an_Unit1 DECIMAL,
    @an_Unit2 DECIMAL
)
RETURNS DECIMAL
BEGIN

    DECLARE @result DECIMAL

    IF @an_Qty > 0
        BEGIN
            SET @result = FLOOR  ( @an_Qty / ( @an_Unit1 * @an_Unit2 ) )
        END
    ELSE
        BEGIN
            SET @result = CEILING( @an_Qty / ( @an_Unit1 * @an_Unit2 ) )
        END

RETURN @result

END
-- #df:end#

-- #df:begin#
CREATE FUNCTION fx_qtybystyle2(
    @an_Qty   DECIMAL,
    @an_Unit1 DECIMAL,
    @an_Unit2 DECIMAL
)
RETURNS DECIMAL
BEGIN

        DECLARE @result DECIMAL

    IF @an_Qty > 0
        BEGIN
            SET @result = FLOOR  ( ( @an_Qty % (@an_Unit1 * @an_Unit2) ) / @an_Unit2 )
        END
    ELSE
        BEGIN
            SET @result = CEILING( ( @an_Qty % (@an_Unit1 * @an_Unit2) ) / @an_Unit2 )
        END

RETURN @result

END
-- #df:end#

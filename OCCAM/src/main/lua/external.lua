require "lua-channel"

function producer(char, ch)
    PAR(
        function()
            while true do
                KEYSTATE( ch, char )
                print("value send " + char)
            end
        end
    )
end

function consumer(ch)
    PAR(
        function()
            while true do
                local char = ch:IN()
                print("Value get :" + char)
            end
        end
    )
end

function main()
    local ch = Channel:new()
    producer("a", ch)
    consumer(ch)
end

decimal_number = int(input())

binary_representation = bin(decimal_number)[2:][::-1]

bulbs_on = []

for index, value in enumerate(binary_representation):
    if value == '1':
        bulbs_on.append(index + 1)

if bulbs_on:
    print(" ".join(f"bulb {bulb} is on" for bulb in bulbs_on))
else:
    print("No bulbs are switched on.")
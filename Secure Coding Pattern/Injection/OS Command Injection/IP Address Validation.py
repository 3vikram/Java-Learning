import re

def ip_address_validation(ip_address):

    match = re.match('^([1-2]*\d{1,2}\.){3}[1-2]*\d{1,2}$', ip_address)
    if match:
        return "Valid IP Address"
    else:
        return "The entered input is not a valid IP Address"


if __name__ == "__main__":
    IP = input("Enter the IP address to verify: ")
    run = ip_address_validation(IP)
    print(run)

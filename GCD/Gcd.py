def max_gcd(v):
    if len(v) < 2:
        return 0
    ans = -10**9
    for i in range(1, len(v)):
        a = v[i-1]
        b = v[i]
        if b[0] == a[0]:
            ans = max(ans, gcd(a[1], b[1]))
    return ans

def gcd(n1, n2):
    small = n1 if n1 < n2 else n2
    for i in range(small, 0, -1):
        if n1 % i == 0 and n2 % i == 0:
            return i

if __name__ == "__main__":
    v = [[5, 4], [5, 8], [4, 6], [4, 9], [8, 10], [10, 20], [10, 30]]
    print(max_gcd(v))
    print(gcd(4, 14))

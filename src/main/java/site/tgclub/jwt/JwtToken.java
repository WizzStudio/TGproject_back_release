package site.tgclub.jwt;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fzm
 * @date 2017/11/25
 **/
public class JwtToken {

    public static String createToken(String managerName) throws UnsupportedEncodingException {
        Map<String, Object> header = new HashMap<>(16);
        header.put("type", "jwt");
        header.put("alg", "HS256");
        return JWT.create()
                .withHeader(header)
                .withClaim("managerName", managerName)
                .sign(Algorithm.HMAC256("secret"));
    }

    public static Map<String, Claim> verifyToken(String token) throws Exception {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256("secret")).build();
        DecodedJWT jwt = verifier.verify(token);

        return jwt.getClaims();
    }
}
